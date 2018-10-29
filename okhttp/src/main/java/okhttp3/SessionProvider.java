package okhttp3;

import okhttp3.internal.http2.Header;

public interface SessionProvider {

  String getSession();

  Header getSessionHeader();
}
