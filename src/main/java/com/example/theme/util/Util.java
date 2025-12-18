package com.example.theme.util;

public class Util {

	static public String replace(String msg, String url) {
		
		if(msg.isBlank())msg = "";
		
		if(url.isBlank())url = "/";
		
		return String.format("""
				<script>
				const msg = '%s';
					if(msg != ""){
						alert(msg);
					}
					location='%s'
				</script>
				""", msg, url);
	}
	
}
