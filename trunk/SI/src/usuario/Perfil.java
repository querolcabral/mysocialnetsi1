package usuario;

import java.util.ArrayList;

public class Perfil {

	public ArrayList<Field> fields = new ArrayList<Field>();
	public Field aboutMe = new Field("aboutMe");
	public Field contactEmail = new Field("contactEmail");
	public Field country = new Field("country");
	public Field city = new Field("city");
	public Field photo = new Field("photo");
	public Field gender = new Field("gender");
	public Field age = new Field("age");

	public Perfil(){;
	this.fields.add(this.aboutMe);
	this.fields.add(this.contactEmail);
	this.fields.add(this.country);
	this.fields.add(this.city);
	this.fields.add(this.photo);
	this.fields.add(this.gender);
	this.fields.add(this.age);
	}

	public String getAboutMe(){
		return this.aboutMe.getField();
	}

	public void setAboutMe(String about){
		this.aboutMe.setField(about);
	}

	public String getAge(){
		return this.age.getField();
	}

	public void setAge(String age){
		this.age.setField(age);
	}

	public String getPhoto(){
		return this.photo.getField();
	}

	public void setPhoto(String photo){
		this.photo.setField(photo);
	}

	public String getCounty(){
		return this.country.getField();
	}

	public void setCountry(String country){
		this.country.setField(country);
	}

	public String getCity(){
		return this.city.getField();
	}

	public void setCity(String city){
		this.city.setField(city);
	}

	public String getGender(){
		return this.gender.getField();
	}

	public void setGender(String gender){
		this.gender.setField(gender);
	}

	public String getContactEmail(){
		return this.contactEmail.getField();
	}

	public void setContactEmail(String contactEmail){
		this.contactEmail.setField(contactEmail);
	}

	public void changeFieldPermission(String field, String type) {
		Field fieldToChange = null;
		for (Field f : this.fields){
			if(f.getName().equals(field)) fieldToChange = f;
		}

		fieldToChange.setPermission(type);

	}

	public String checkProfile(String visibility) {
		String saida = "";
		for(Field f : this.fields){
			if(f.getPermission().getName().equals(visibility)) saida += f.getName() + " "; 
		}
		return saida;
	}

}
