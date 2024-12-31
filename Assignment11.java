import java.awt.Color;

//import art.Picture;

/*
 * This class contains methods to create and perform operations on a collage of images.
 * 
 * @author Ana Paula Centeno
 */ 

public class Collage {

    // The orginal picture
    private Picture originalPicture;

    // The collage picture is made up of tiles.
    // Each tile consists of tileDimension X tileDimension pixels
    // The collage picture has collageDimension X collageDimension tiles
    private Picture collagePicture;

    // The collagePicture is made up of collageDimension X collageDimension tiles
    // Imagine a collagePicture as a 2D array of tiles
    private int collageDimension;

    // A tile consists of tileDimension X tileDimension pixels
    // Imagine a tile as a 2D array of pixels
    // A pixel has three components (red, green, and blue) that define the color 
    // of the pixel on the screen.
    private int tileDimension;
    
    /*
     * One-argument Constructor
     * 1. set default values of collageDimension to 4 and tileDimension to 150
     * 2. initializes originalPicture with the filename image
     * 3. initializes collagePicture as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see constructors for the Picture class).
     * 4. update collagePicture to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public Collage (String filename) {

        // WRITE YOUR CODE HERE
        this.collageDimension = 4;
        this.tileDimension = 150;
        this.originalPicture = new Picture(filename);
        this.collagePicture = new Picture(tileDimension*collageDimension,tileDimension*collageDimension);
        scale(originalPicture, collagePicture);
        //showOriginalPicture();

        

    }

    /*
     * Three-arguments Constructor
     * 1. set default values of collageDimension to cd and tileDimension to td
     * 2. initializes originalPicture with the filename image
     * 3. initializes collagePicture as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collagePicture to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */    
    public Collage (String filename, int td, int cd) {

        // WRITE YOUR CODE HERE
        this.collageDimension = cd;
        this.tileDimension = td;
        this.originalPicture = new Picture(filename);
        this.collagePicture = new Picture(tileDimension*collageDimension,tileDimension*collageDimension);
        scale(originalPicture, collagePicture);
    }


    /*
     * Scales the Picture @source into Picture @target size.
     * In another words it changes the size of @source to make it fit into
     * @target. Do not update @source. 
     *  
     * @param source is the image to be scaled.
     * @param target is the 
     */
    public static void scale (Picture source, Picture target) {

        // WRITE YOUR CODE HERE
        int width = target.width();
        int height = target.height();

        for (int targetCol = 0; targetCol < width; targetCol++) {
            for (int targetRow = 0; targetRow < height; targetRow++) {
                int sourceCol = targetCol * source.width()  / width;
                int sourceRow = targetRow * source.height() / height;
                Color color = source.get(sourceCol, sourceRow);
                target.set(targetCol, targetRow, color);
            }
            


        //int width = target.width();
        //int height = target.width();

        //source = new Picture(width,height);
    }
}
     /*
     * Returns the collageDimension instance variable
     *
     * @return collageDimension
     */   
    public int getCollageDimension() {
        return collageDimension;
    }

    /*
     * Returns the tileDimension instance variable
     *
     * @return tileDimension
     */    
    public int getTileDimension() {
        return tileDimension;
    }

    /*
     * Returns original instance variable
     *
     * @return original
     */
    
    public Picture getOriginalPicture() {
        return originalPicture;
    }

    /*
     * Returns collage instance variable
     *
     * @return collage
     */
    
    public Picture getCollagePicture() {
        return collagePicture;
    }

    /*
     * Display the original image
     * Assumes that original has been initialized
     */    
    public void showOriginalPicture() {
        originalPicture.show();
    }

    /*
     * Display the collage image
     * Assumes that collage has been initialized
     */    
    public void showCollagePicture() {
	    collagePicture.show();
    }

    /*
     * Updates collagePicture to be a collage of tiles from original Picture.
     * collagePicture will have collageDimension x collageDimension tiles, 
     * where each tile has tileDimension X tileDimension pixels.
     */    
    public void makeCollage () {

        // WRITE YOUR CODE HERE
        Picture one = new Picture(this.tileDimension, this.tileDimension);
        scale(this.originalPicture, one);
         for(int i = 0; i < this.collageDimension*this.tileDimension; i = i + this.tileDimension){
            for(int j = 0; j < this.collageDimension*this.tileDimension; j = j + this.tileDimension){
           //     for(int i = 0; i < this.collageDimension*this.tileDimension; i = i + this.tileDimension){       
              
        for(int side = 0; side < this.tileDimension; side = side + 1){
            for(int up = 0; up < this.tileDimension; up = up + 1){
                        
                 Color color = one.get(up, side);

                this.collagePicture.set(j+up, i+side, color);




        }

                }
            
             }
        
        }
        
        
        
        
       // this.collagePicture = 
    }

    /*
     * Colorizes the tile at (collageCol, collageRow) with component 
     * (see Week 9 slides, the code for color separation is at the 
     *  book's website)
     *
     * @param component is either red, blue or green
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void colorizeTile (String component,  int collageCol, int collageRow) {

        // WRITE YOUR CODE HERE
        

         for(int a = collageRow*this.tileDimension; a < (collageRow+1)*(this.tileDimension); a++){
           
             for(int b = collageCol*this.tileDimension; b < (collageCol+1)*this.tileDimension; b++){
                        
                        int intensity;
                    
                        Color color = this.collagePicture.get(b, a);

                        

                       Color ncolor;
                     
                        if (component == "red") {

                            intensity = color.getRed();
                            ncolor = new Color(intensity, 0, 0);
                            this.collagePicture.set(b, a, ncolor);

                        }


                        else if (component == "blue") {

                            intensity = color.getBlue();
                            ncolor = new Color(0, 0, intensity);
                            this.collagePicture.set(b, a, ncolor);



                        }


                        else {

                            intensity = color.getGreen();
                            ncolor = new Color(0, intensity, 0);
                            this.collagePicture.set(b, a, ncolor);







                        }

                        
                        

                        
                    }
                }
            }
    

    /*
     * Replaces the tile at collageCol,collageRow with the image from filename
     * Tile (0,0) is the upper leftmost tile
     *
     * @param filename image to replace tile
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void replaceTile (String filename,  int collageCol, int collageRow) {

        // WRITE YOUR CODE HERE
        Picture original = new Picture(this.tileDimension, this.tileDimension);
        Picture changed = new Picture(filename); 

         scale(changed, original);

        int xaxis = 0;
        int yaxis = 0;

        for(int a = collageRow*this.tileDimension; a < (collageRow+1)*(this.tileDimension); a++){
            for(int b = collageCol*this.tileDimension; b < (collageCol+1)*this.tileDimension; b++){
                
                        Color color = original.get(yaxis, xaxis);
                        this.collagePicture.set(b, a, color);

                        if(this.tileDimension-yaxis == 1){
                            yaxis = 0;
                            xaxis = xaxis + 1;
                        }
                        else{
                            yaxis = yaxis + 1;
                        }
                    
                
            }
        }


    }

    /*
     * Grayscale tile at (collageCol, collageRow)
     *
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void grayscaleTile (int collageCol, int collageRow) {

        // WRITE YOUR CODE HERE
         for(int a = collageRow*this.tileDimension; a < (collageRow+1)*(this.tileDimension); a++){
            
            for(int b = collageCol*this.tileDimension; b < (collageCol+1)*this.tileDimension; b++){
                
                Color color = this.collagePicture.get(b, a);
                
                color = toGray(color);
                this.collagePicture.set(b, a, color);

                        
                }
            }
        }

    

    /**
     * Returns the monochrome luminance of the given color as an intensity
     * between 0.0 and 255.0 using the NTSC formula
     * Y = 0.299*r + 0.587*g + 0.114*b. If the given color is a shade of gray
     * (r = g = b), this method is guaranteed to return the exact grayscale
     * value (an integer with no floating-point roundoff error).
     *
     * @param color the color to convert
     * @return the monochrome luminance (between 0.0 and 255.0)
     */
    private static double intensity(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        if (r == g && r == b) return r;   // to avoid floating-point issues
        return 0.299*r + 0.587*g + 0.114*b;
    }

    /**
     * Returns a grayscale version of the given color as a {@code Color} object.
     *
     * @param color the {@code Color} object to convert to grayscale
     * @return a grayscale version of {@code color}
     */
    private static Color toGray(Color color) {
        int y = (int) (Math.round(intensity(color)));   // round to nearest int
        Color gray = new Color(y, y, y);
        return gray;
    }

    /*
     * Closes the image windows
     */
    public void closeWindow () {
        if ( originalPicture != null ) {
            originalPicture.closeWindow();
        }
        if ( collagePicture != null ) {
            collagePicture.closeWindow();
        }
    }
}
