void setup() {
	size(300, 300);
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  fill(mouseY)
  background(200);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill(mouseX, mouseY, 120);
  rect(mouseX, mouseY,20,100);
  // Draw Zoog's head
  stroke(0);
  fill(mouseX, mouseY, 150);
  ellipse(mouseX, mouseY - 30,60,60);
  // Draw Zoog's Eyes
  fill(mouseX, mouseY, 255);
  ellipse(mouseX - 10, mouseY - 30,16,32);
  ellipse(mouseX - -10, mouseY - 30,16,32);
  // Draw Zoog's legs
  stroke(mouseX, mouseY, 150);
  line(mouseX - 10, mouseY + 50, mouseX - 100, mouseY + 100);
  line(mouseX + 10, mouseY + 50, mouseX + 100, mouseY + 100);
}