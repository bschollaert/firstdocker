package first.docker.entity;

public class People {
	
	private Long people_id;
	private String surname;
	private Integer age;
	
	public People() {
		
	}	
	
	public People(Long people_id, String surname, Integer age) {
		this.people_id = people_id;
		this.surname = surname;
		this.age = age;
	}

	public Long getPeople_id() {
		return people_id;
	}
	public void setPeople_id(Long people_id) {
		this.people_id = people_id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [people_id=" + people_id + ", surname=" + surname + ", age=" + age + "]";
	}
	
	

}
