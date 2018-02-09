import java.util.ArrayList;

public class AgentArray
	{
		static ArrayList <Agent> myAgents = new ArrayList<Agent>();
//		public static void main(String[] args)
//			{
//				fillArray();
//				printArray();
//			}
		public static void fillArray()
			{
				myAgents.add(new Agent("Nicole Resciniti", "fantasy YA", "nicole@theseymouragency.com", "the first five pages"));	
				myAgents.add(new Agent("Danielle Burby", "strong, distinctive voice, seaside novels, and girls with swords", "querydanielle@nelsonagency.com", "the first ten pages"));	
				myAgents.add(new Agent("Kaylee Davis", "flawed heroes, thought-provoking, and out of this world stories", "query@deemuraliterary.com", "an author bio, short synopsis, and the first twenty-five pages"));	
				myAgents.add(new Agent("Carrie Pestritto", "working closely with authors and fantasy stories", "Submit on website", "the first three chapters and a synopsis"));	
				myAgents.add(new Agent("Rebecca Strauss", "a compelling story, fresh voice, and working close with emerging authors", "submissions@defilterary.com", "an author bio and the first five pages"));	

			}
		 static void printArray()
			{
				for (int i = 0; i < myAgents.size(); i++)
					{
				System.out.println(myAgents.get(i).getName() + " is looking for " + myAgents.get(i).getInterests() + ". Contact: " + myAgents.get(i).getEmail() + ". This agent is requesting " + myAgents.get(i).getRequirements() + ".");
					}
			}
				

	}
