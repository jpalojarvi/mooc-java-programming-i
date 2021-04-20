    public class Game {

        private String homeTeamName;
        private String visitingTeamName;
        private int homeTeamPoints;
        private int visitingTeamPoints;

        public Game(String homeTeamName, String visitingTeamName, int homeTeamPoints, int visitingTeamPoints) {
            this.homeTeamName = homeTeamName;
            this.visitingTeamName = visitingTeamName;
            this.homeTeamPoints = homeTeamPoints;
            this.visitingTeamPoints = visitingTeamPoints;
        }
        
        public String getHomeTeamName(){
            return homeTeamName;
        }
        
        public String getVisitingTeamName(){
            return visitingTeamName;
        }
        
        public int getHomeTeamPoints(){
            return homeTeamPoints;
        }
        
        public int getVisitingTeamPoints(){
            return visitingTeamPoints;
        }
        
        @Override
        public String toString(){
            return this.homeTeamName  + " vs " + this.visitingTeamName + ": " + this.homeTeamPoints + "-" + this.visitingTeamPoints;
        }
        
    }