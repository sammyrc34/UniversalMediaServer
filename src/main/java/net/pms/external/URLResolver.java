package net.pms.external;

import java.util.List;


public interface URLResolver extends ExternalListener {
	
	class URLResult {
		public String url;
		public List<String> args;
		public int flags;
	}

	public URLResult urlResolve(String url);
}
