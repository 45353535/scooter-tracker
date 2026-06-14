package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ob3 {
    public static pb3 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new pb3(str);
    }

    public static pb3 b() {
        return new pb3("Server temporarily unavailable. Please, try again later.");
    }

    public static pb3 b(String str) {
        return new pb3(str);
    }

    public static pb3 a(vk0 vk0Var) {
        String message = vk0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        return new pb3(message);
    }

    public static pb3 a() {
        return new pb3("Internal error. Failed to parse response");
    }
}
