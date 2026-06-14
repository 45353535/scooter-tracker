package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;

/* JADX INFO: loaded from: classes10.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z10) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z11) {
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|126|3|(1:5)|11|(8:13|14|127|15|(10:108|16|(1:18)(1:129)|35|56|(2:116|58)|(1:62)|(3:119|66|(1:(2:84|(1:86))(2:81|(1:83)))(1:71))(0)|118|97)|23|(4:25|123|26|(1:28)(1:32))(1:33)|34)(2:41|42)|110|43|(2:121|45)|(1:49)|52|(0)(0)|118|97|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
                    
                        r3 = e;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:104:0x0171 A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #3 {Exception -> 0x016d, blocks: (B:100:0x0169, B:104:0x0171), top: B:112:0x0169 }] */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:116:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f1, blocks: (B:58:0x00ed, B:62:0x00f5), top: B:116:0x00ed }] */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
                    /* JADX WARN: Type inference failed for: r0v18, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v1 */
                    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v11 */
                    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v13 */
                    /* JADX WARN: Type inference failed for: r6v14 */
                    /* JADX WARN: Type inference failed for: r6v15 */
                    /* JADX WARN: Type inference failed for: r6v16 */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r6v4 */
                    /* JADX WARN: Type inference failed for: r6v5 */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v9 */
                    /* JADX WARN: Type inference failed for: r7v0 */
                    /* JADX WARN: Type inference failed for: r7v1 */
                    /* JADX WARN: Type inference failed for: r7v13 */
                    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    /* JADX WARN: Type inference failed for: r7v4 */
                    /* JADX WARN: Type inference failed for: r7v5 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void runTask() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 380
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.download.DownLoadUtils.AnonymousClass1.runTask():void");
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
