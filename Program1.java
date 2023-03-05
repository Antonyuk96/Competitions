public class Program1{

    public static void main(String[] args) {
        // 1-ая команда
        Team team1= new Team("First");
        team1.addSportsmam( new Human("1",400,0.9));
        team1.addSportsmam( new Cat("2", 120, 0.5));
        team1.addSportsmam( new Robot("3",2000,1.8));
        // Вторая команда
        Team team2 = new Team("Second");
        team2.addSportsmam( new Human("4",800,0.5));
        team2.addSportsmam( new Cat("5", 500, 0.9));
        team2.addSportsmam( new Robot("6",180,0.3));
        // Полоса препятствий из дорожек и стенок
        ObstacleCourse course1=new ObstacleCourse();
        course1.obstacleAdd(new Obstacle(new Wall(0.2), new Road(100)));
        course1.obstacleAdd(new Obstacle(new Wall(0.8), new Road(300)));
        course1.obstacleAdd(new Obstacle(new Wall(1.5), new Road(1500)));
        // Участвует первая команда
        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacles());
        // Участие второй команды
        team2.getTeamInfo();
        team2.startCompetition(course1.getObstacles());
        // Выявить победителя
        team1.getWinner();
        team2.getWinner();
    }
}