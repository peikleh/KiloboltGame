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

/**
 *
 * @author nevin
 */
import java.awt.Image;

public class Tile {

    private int tileX, tileY, speedX, type;
    public Image tileImage;

    private Background bg = StartingClass.getBg1();

    public Tile(int x, int y, int typeInt) {
        tileX = x * 40;
        tileY = y * 40;

        type = typeInt;

        if (type == 1) {
            tileImage = StartingClass.tileocean;
        } else if (type == 2) {

            tileImage = StartingClass.tiledirt;
        }

    }

    public void update() {
        // TODO Auto-generated method stub
        if (type == 1) {
            if (bg.getSpeedX() == 0) {
                speedX = -1;
            } else {
                speedX = -2;
            }

        } else {
            speedX = bg.getSpeedX() * 5;
        }

        tileX += speedX;
    }

    public int getTileX() {
        return tileX;
    }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }

    public Image getTileImage() {
        return tileImage;
    }

    public void setTileImage(Image tileImage) {
        this.tileImage = tileImage;
    }

}
