package chucknorrissendssms.com.app;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String joke;
//    private String categories;
    

    public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}

//	public String getCategories() {
//		return categories;
//	}
//
//	public void setCategories(String categories) {
//		this.categories = categories;
//	}

	public Value() {
    }

    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", joke='" + joke + '\'' +
                '}';
    }
}
