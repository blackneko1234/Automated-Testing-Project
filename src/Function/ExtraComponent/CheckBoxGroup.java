package Function.ExtraComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class CheckBoxGroup extends JPanel {
    public ArrayList<String> KeepIndex = new ArrayList<>();
    private final JCheckBox all;
    private final ArrayList<JCheckBox> checkBoxes;

    public CheckBoxGroup(String... options) {
        checkBoxes = new ArrayList<>();
        setLayout(new BorderLayout());
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
        all = new JCheckBox("Select All");
        all.addActionListener(e -> {
            for (JCheckBox cb : checkBoxes) {
                cb.setSelected(all.isSelected());
                String SplitText = cb.getText().split("\\.")[0];

                if (all.isSelected()) {
                    all.setText("Deselect All");
                    System.out.println(SplitText);
                    KeepIndex.add(SplitText);
                    Collections.sort(KeepIndex);
                } else if (!all.isSelected()) {
                    all.setText("Select All");
                    KeepIndex.removeAll(KeepIndex);
                }
            }
        });
        header.add(all);
        add(header, BorderLayout.NORTH);

        JPanel content = new ScrollablePane(new GridBagLayout());
        content.setBackground(UIManager.getColor("List.background"));
        if (options.length > 0) {
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTHWEST;
            gbc.weightx = 1;
            for (int index = 0; index < options.length - 1; index++) {
                JCheckBox cb = new JCheckBox(options[index]);
                cb.setOpaque(false);
                checkBoxes.add(cb);

                cb.addActionListener(e -> {
                    String SplitText = cb.getText().split("\\.")[0];
                    if (cb.isSelected()) {
                        System.out.println(SplitText);
                        KeepIndex.add(SplitText);
                        Collections.sort(KeepIndex);
                    } else if (!cb.isSelected()) {
                        KeepIndex.remove(SplitText);
                        System.out.println(KeepIndex);
                    }
                });
                content.add(cb, gbc);
            }

            JCheckBox cb = new JCheckBox(options[options.length - 1]);
            cb.setOpaque(false);
            checkBoxes.add(cb);
            gbc.weighty = 1;
            cb.addActionListener(e -> {
                String SplitText = cb.getText().split("\\.")[0];
                if (cb.isSelected()) {
                    System.out.println(SplitText);
                    KeepIndex.add(SplitText);
                    Collections.sort(KeepIndex);
                } else if (!cb.isSelected()) {
                    KeepIndex.remove(SplitText);
                }
            });
            content.add(cb, gbc);
        }
        add(new JScrollPane(content));
    }

    public static class ScrollablePane extends JPanel implements Scrollable {

        public ScrollablePane(LayoutManager layout) {
            super(layout);
        }

        @Override
        public Dimension getPreferredScrollableViewportSize() {
            return new Dimension(200, 200);
        }

        @Override
        public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
            return 32;
        }

        @Override
        public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
            return 32;
        }

        @Override
        public boolean getScrollableTracksViewportWidth() {
            boolean track = false;
            Container parent = getParent();
            if (parent instanceof JViewport) {
                JViewport vp = (JViewport) parent;
                track = vp.getWidth() > getPreferredSize().width;
            }
            return track;
        }

        @Override
        public boolean getScrollableTracksViewportHeight() {
            boolean track = false;
            Container parent = getParent();
            if (parent instanceof JViewport) {
                JViewport vp = (JViewport) parent;
                track = vp.getHeight() > getPreferredSize().height;
            }
            return track;
        }
    }
}