package hust.soict.dsai.aims.screen;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel cost = new JLabel(media.getCost() + "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER));
        container.add(new JButton("Add to cart"));
        
        if (media instanceof DigitalVideoDisc || media instanceof CompactDisc) {
            container.add(new JButton("Play"));
        }
        
        container.add(Box.createVerticalGlue());
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}