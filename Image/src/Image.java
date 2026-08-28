import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;

public class Image {
    private int height;
    private int width;
    private String fileName;
    private String quality;

    public Image(int height, int width, String fileName, String quality) {
        this.height = height;
        this.width = width;
        this. fileName = fileName;
        this.quality = quality;
    }
    public boolean isPortrait() {
        return this.width < this.height;
    }

    public int size() {
        return this.width * this.height;
    }
    public boolean isLarger(Image that) {
        return this.size() > that.size();
    }
}