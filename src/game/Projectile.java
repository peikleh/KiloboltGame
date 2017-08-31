/*
 * Copyright (C) 2017 nevin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package game;

import java.awt.Rectangle;

/**
 *
 * @author nevin
 */
public class Projectile {

    private int x, y, speedX;
    private boolean visible;
    private Rectangle r;

    public Projectile(int startX, int startY) {
        x = startX;
        y = startY;
        speedX = 7;
        visible = true;

        r = new Rectangle(0, 0, 0, 0);
    }

    public void update() {
        x += speedX;
        r.setBounds(x, y, 10, 5);
        if (x > 800) {
            visible = false;
            r = null;
        }
        if (x < 800) {
            checkCollision();
        }
    }

    private void checkCollision() {
        if (r.intersects(StartingClass.hb.r)) {
            visible = false;
            StartingClass.score += 1;
        }

        if (r.intersects(StartingClass.hb2.r)) {
            visible = false;
            StartingClass.score += 1;

        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
