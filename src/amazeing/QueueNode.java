/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazeing;

/**
 *
 * @author Michail Sitmalidis
 */
public class QueueNode {

    Point point; // The cordinates of a cell 
    int dist; // cell's distance of from the source 

    public QueueNode(Point point, int dist) {
        this.point = point;
        this.dist = dist;
    }

    public Point getPoint() {
        return point;
    }

    public int getDist() {
        return dist;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }
    
    

}
