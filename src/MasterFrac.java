
public abstract class MasterFrac {
	private String name = "To infinity and beyond with Rational Numbers";
	private String versionNum = "V1.0.0";
	private String authorName = "Atousa Saleh";
	private String lastModifiedAt = "2022-10-15 22:00:00";
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getVersionNum()
	{
		return this.versionNum;
	}
	
	public void setVersionNum(String versionNum)
	{
		this.versionNum = versionNum;
	}
	
	public String getAuthorName()
	{
		return this.authorName;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	
	public String getLastModifiedAt()
	{
		return this.lastModifiedAt;
	}
	
	public void setLastModifiedAt(String lastModifiedAt)
	{
		this.lastModifiedAt = lastModifiedAt;
	}
}
