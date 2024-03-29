package cycling;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Race {
	static int nextId = 0;
	String name;
	String desc;
	int id;
	int currentStageID;
	ArrayList<Stage> stages;


	// Constructor
	public Race(String name, String desc) {
		this.id = nextId;
		nextId++;
		this.name = name;
		this.desc = desc;
		this.currentStageID = 0;
		this.stages = new ArrayList<Stage>();
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public int getId(){
		return id;
	}

		public ArrayList<Stage> getStages() {return stages;}

	public void addStage(String stageName, String description, double length, LocalDateTime startTime,
						 StageType type){
		stages.add(new Stage(stageName,description,length,startTime,type));
	}
	public void removeStage(Stage stage){
		stages.remove(stage);
	}
	//Setter

}
