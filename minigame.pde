int circleX, circleY; // coordinates of the circle
int circleSize = 30; // diameter of the circle
int rectX, rectY; // coordinates of the rectangles
int rectSize = 40; // size of the rectangles
int rectSpeed = 5; // speed of the rectangles
int score = 0; // player's score
boolean gameover = false; // is the game over?

void setup() {
  size(400, 400);
  circleX = width/2;
  circleY = height/2;
  rectX = width + rectSize;
  rectY = (int) random(height);
}

void draw() {
  background(255);
  
  if (!gameover) {
    // move the circle with arrow keys
    if (keyPressed) {
      if (keyCode == LEFT) {
        circleX -= 5;
      } else if (keyCode == RIGHT) {
        circleX += 5;
      } else if (keyCode == UP) {
        circleY -= 5;
      } else if (keyCode == DOWN) {
        circleY += 5;
      }
    }
    
    // move the rectangles
    rectX -= rectSpeed;
    if (rectX < -rectSize) {
      rectX = width + rectSize;
      rectY = (int) random(height);
      score++;
    }
    
    // check for collision
    if (dist(circleX, circleY, rectX, rectY) < circleSize/2 + rectSize/2) {
      gameover = true;
    }
    
    // draw the circle and rectangles
    fill(0, 255, 0);
    ellipse(circleX, circleY, circleSize, circleSize);
    fill(0, 0, 255);
    rect(rectX, rectY, rectSize, rectSize);
    
    // display the score
    textSize(24);
    textAlign(CENTER, CENTER);
    fill(0);
    text("Score: " + score, width/2, 50);
  } else {
    // display game over message
    textSize(32);
    textAlign(CENTER, CENTER);
    fill(255, 0, 0);
    text("GAME OVER", width/2, height/2);
  }
}
