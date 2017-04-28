/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

/**
 *
 * @author gpalomox
 */
public class Board {
    private final BoarPosition[][] spots;

    public Board() {
        this.spots = new BoarPosition[8][8];
    }
    public Board(int pSize1) {
        
       this.spots = new BoarPosition[pSize1][pSize1];
        
        for(int i=0; i<spots.length; i++){
            for(int j=0; j<spots.length; j++){
                this.spots[i][j] = new BoarPosition(i, j);
            }
        }
    }

    public BoarPosition getSpot(int x, int y) {
        return spots[x][y];
    }

}
