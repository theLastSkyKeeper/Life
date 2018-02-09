
public class Baby
	{
		String gender;
		String hairColor;
		String eyeColor;
		
		public Baby (String g, String h, String e, int w)
		{
			gender = g;
			hairColor = h;
			eyeColor = e;
		}

		public String getGender()
			{
				return gender;
			}

		public void setGender(String gender)
			{
				this.gender = gender;
			}

		public String getHairColor()
			{
				return hairColor;
			}

		public void setHairColor(String hairColor)
			{
				this.hairColor = hairColor;
			}

		public String getEyeColor()
			{
				return eyeColor;
			}

		public void setEyeColor(String eyeColor)
			{
				this.eyeColor = eyeColor;
			}

	}
