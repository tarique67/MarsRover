package org.example;

public class Rover {

    private int x;
    private int y;
    private char facingDirection;

    public Rover(int x, int y, char facingDirection) {
        if(x<0 || y<0) throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
        this.facingDirection = facingDirection;
    }

    public String move(char instruction) {
        if(instruction == 'L')
            turnLeft();
        else if(instruction == 'R')
            turnRight();
        else if(instruction == 'M')
            moveForward();

        return this.x+" "+this.y+" "+this.facingDirection;
    }

    private void moveForward() {
        if (this.facingDirection == 'N') {
            this.y = y + 1;
        } else if (this.facingDirection == 'S') {
            this.y = y - 1;
        } else if (this.facingDirection == 'W') {
            this.x = x - 1;
        } else if (this.facingDirection == 'E') {
            this.x = x + 1;
        }
    }

    private void turnRight() {
        if (this.facingDirection == 'N') {
            this.facingDirection = 'E';
        } else if (this.facingDirection == 'W') {
            this.facingDirection = 'N';
        } else if (this.facingDirection == 'S') {
            this.facingDirection = 'W';
        } else if (this.facingDirection == 'E') {
            this.facingDirection = 'S';
        }
    }

    private void turnLeft() {
        if (this.facingDirection == 'N') {
            this.facingDirection = 'W';
        } else if (this.facingDirection == 'W') {
            this.facingDirection = 'S';
        } else if (this.facingDirection == 'S') {
            this.facingDirection = 'E';
        } else if (this.facingDirection == 'E') {
            this.facingDirection = 'N';
        }
    }

}
