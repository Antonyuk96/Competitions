public class Obstacle {
    private  Wall wall;
    private Road road;
    public Obstacle(Wall wall, Road road){
        this.road=road;
        this.wall=wall;
    }
    // Длина дорожки
    public int getRoadLength(){
    return road.getLength();
    }
    // Высота стенки
    public Double getWallHeight(){
        return wall.getHeight();
    }
}