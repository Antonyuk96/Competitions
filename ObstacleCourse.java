import java.util.ArrayList;

// Полоса препятствий
public class ObstacleCourse {

    private ArrayList<Obstacle> obstaclecourse;

    public ObstacleCourse() {
        obstaclecourse=new ArrayList<Obstacle>();
    }
    // Добавляет препятствие из дорожки и стены
    public void obstacleAdd(Obstacle obstacle){
        obstaclecourse.add(obstacle);
    }
    // Препятствия
    public  ArrayList<Obstacle> getObstacles(){ return obstaclecourse;}

}