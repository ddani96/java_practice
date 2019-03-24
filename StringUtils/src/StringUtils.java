public class StringUtils {

    public static String reverse(String source) {
        if(source == null){
            return source;
        } else{
            String newSource = "";
            for (int i = source.length() - 1; i >= 0; i--) {
                newSource += source.charAt(i);
            }
            return newSource;
        }

    }

    public static String reverseWords(String source) {
        if(source == null){
            return source;
        }
        String[] newSources = source.split(" ");
        String newSource = "";
        for (int i = newSources.length - 1; i >= 0; i--) {
            if (i < newSources.length - 1) {
                newSource += " " + newSources[i];
            } else {
                newSource += newSources[i];
            }

        }
        return newSource;
    }

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }

    public static boolean isValidGmail(String email) {
        if (email == null) {
            return false;
        }
        if (email.endsWith("@gmail.com")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidEmail(String email, String[] tlds) {

        if (email == null || email.length()==0 || tlds == null) {
            return false;
        }
        if (email.contains("@") && email.contains(".") && tlds.length != 0) {
                    for (int i = 0; i < tlds.length - 1; i++) {
                        if (email.endsWith(tlds[i]) && email.indexOf("@") < email.indexOf(".")) {
                            return true;
                        }
                    }
        } else {
            return false;
        }
        return false;
    }
}

/*
public class StringUtils {

	public static String reverse(String source) {
		if (source == null)
			return null;
		String temp = "";
		for (int i = source.length()-1; i >= 0; i--) {
			temp += source.charAt(i);
		}
		return temp;
	}

	public static String reverseWords(String source) {
		if (source == null)
			return null;
		String[] parts = source.split(" ");
		String temp = "";
		for (int i = parts.length-1; i >= 0; i--) {
			if (i != parts.length-1)
				temp += " ";
			temp += parts[i];
		}
		return temp;
	}

	public static boolean isValidEmail(String email) {
		if (email == null)
			return false;
		return email.contains("@") && email.contains(".");
	}

	public static boolean isValidGmail(String email) {
		if (email == null)
			return false;
		return email.endsWith("@gmail.com");
	}

	public static boolean isValidEmail(String email, String[] tlds) {
		if (email == null || tlds == null)
			return false;
		if (!isValidEmail(email))
			return false;
		String examinedTld = email.substring(email.lastIndexOf('.')+1);
		for (String tld : tlds) {
			if (tld == null)
				continue;
			if (tld.equals(examinedTld)) {
				return true;
			}
		}
		return false;
	}

}*/