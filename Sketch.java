import processing.core.PApplet;

public class Sketch extends PApplet {

   public void settings() {
	// put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  float circleX = 150;
  float circleY = 150;

   public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    if (keyPressed) {
     if (key == 'r') {
        background(255, 0, 0);
      }
      else if (key == 'g') {
        background(0, 255, 0);
      }
      else if (key == 'b') {
        background(0, 0, 255);
      }
    }

    if (upPressed) {
      circleY--;
    }
    if (downPressed) {
      circleY++;
    }
    if (leftPressed) {
      circleX--;
    }
    if (rightPressed) {
      circleX++;
    }
  
    ellipse(circleX, circleY, 50, 50);

  }
  public void mousePressed(){
    background (0); 
  }

  public void mouseDragged(){
    fill(255,0,0); 
    rect(mouseX, mouseY, 50, 50);
  }


  public void keyPressed() {
    fill (255, 192, 203);
    ellipse(mouseX, mouseY, 50, 50);
    
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }
}