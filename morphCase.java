package humanize;
public class morphCase {
	private String normalCase;
	public String getNormalCase() {
		return normalCase;
	}
	public morphCase setNormalCase(String normalCase) {
		this.normalCase = normalCase;
		return this;
	}
	public morphCase() {
		this.setNormalCase("");
	}
	public morphCase (String normalCase) {
		this.setNormalCase(normalCase);
	}
	public String toUpperCase() {
		return (this.normalCase).toUpperCase();
	}
	public String toLowerCase() {
		return (this.normalCase).toLowerCase();
	}
	public String toCamelCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		for (int i=1; i< strarr.length; i++) {
			strarr[i] = strarr[i].substring(0,1).toUpperCase() + strarr[i].substring(1).toLowerCase();
		}
		return String.join("",strarr);
	}
	public String toDotCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		return String.join(".",strarr);
	}
	public String toConstantCase() {
		String[] strarr = ((this.normalCase).toUpperCase()).split(" ");
		return String.join("_",strarr);
	}
	public String toHeaderCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		for (int i=0; i< strarr.length; i++) {
			strarr[i] = strarr[i].substring(0,1).toUpperCase() + strarr[i].substring(1).toLowerCase();
		}
		return String.join("-",strarr);
	}
	public String toParamCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		return String.join("-",strarr);
	}
	public String toPascalCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		for (int i=0; i< strarr.length; i++) {
			strarr[i] = strarr[i].substring(0,1).toUpperCase() + strarr[i].substring(1).toLowerCase();
		}
		return String.join("",strarr);
	}
	public String toPathCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		return String.join("/",strarr);
	}
	public String toSnakeCase() {
		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
		return String.join("_",strarr);
	}
	public String swapCase() {
	    char[] chars = this.normalCase.toCharArray();
	    for (int i = 0; i < chars.length; i++){
	        char c = chars[i];
	        if (Character.isUpperCase(c)){
	            chars[i] = Character.toLowerCase(c);
	        }
	        else if (Character.isLowerCase(c)){
	            chars[i] = Character.toUpperCase(c);
	        }
	    }
	    return new String(chars);
	}
	public String toTitleCase() {		String[] strarr = ((this.normalCase).toLowerCase()).split(" ");
	for (int i=0; i< strarr.length; i++) {
		strarr[i] = strarr[i].substring(0,1).toUpperCase() + strarr[i].substring(1).toLowerCase();
	}
	return String.join(" ",strarr);
	}


}