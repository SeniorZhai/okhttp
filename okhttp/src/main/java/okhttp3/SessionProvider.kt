package okhttp3


import okhttp3.internal.http2.Header

interface SessionProvider {
  fun getSession(request: Request): String

  fun getSessionHeader(request: Request): Header

}
