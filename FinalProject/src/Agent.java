
public class Agent
	{
		String name;
		String interests;
		String email;
		String requirements;

	public Agent (String n, String i, String e, String r)
		{
			name = n;
			interests = i;
			email = e;
			requirements = r;
		}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public String getInterests()
		{
			return interests;
		}

	public void setInterests(String interests)
		{
			this.interests = interests;
		}

	public String getEmail()
		{
			return email;
		}

	public void setEmail(String email)
		{
			this.email = email;
		}

	public String getRequirements()
		{
			return requirements;
		}

	public void setRequirements(String requirements)
		{
			this.requirements = requirements;
		}
	
	}

