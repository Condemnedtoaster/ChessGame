/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import com.sun.prism.paint.Paint;

/**
 *
 * @author Patrick
 */
abstract class ChessPiece {

    String name;
    Boolean color;
    int Xpos;
    int Ypos;

    public ChessPiece(String name, Boolean color, int Xpos, int Ypos) {
        this.name = name;
        this.color = color;
        this.Xpos = Xpos;
        this.Ypos = Ypos;

    }

    public boolean canMoveTo(int x, int y) {

        if (x < 8 && x > 1 && y < 8 && y > 1 && x != Xpos && y != Ypos) {

            return true;

        }
        else{
            return false;
        }

    }
    
    public int positionToField(int x, int y){
        
        
        if(x == 1 ){
             return 'a'+y;
        }
        if(x == 2){
             return 'b'+y;
        }
        if(x == 3){
             return 'c'+y;
        }
        if(x == 4){
             return 'd'+y;
        }
        if(x == 5){
             return 'e'+y;
        }
        if(x == 6){
             return 'f'+y;
        }
        if(x == 7){
             return 'g'+y;
        }
        if(x == 8){
             return 'h'+y;
        }
        else {
            return 0101;
        }
        
    }

}


