package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts;", "", "()V", "CaptureVideo", "CreateDocument", "GetContent", "GetMultipleContents", "OpenDocument", "OpenDocumentTree", "OpenMultipleDocuments", "PickContact", "PickMultipleVisualMedia", "PickVisualMedia", "RequestMultiplePermissions", "RequestPermission", "StartActivityForResult", "StartIntentSenderForResult", "TakePicture", "TakePicturePreview", "TakeVideo", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultContracts {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final Boolean parseResult(int resultCode, @Nullable Intent intent) {
            return Boolean.valueOf(resultCode == -1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0017J \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "mimeType", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class CreateDocument extends ActivityResultContract<String, Uri> {

        @NotNull
        private final String mimeType;

        public CreateDocument(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.mimeType = mimeType;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public CreateDocument() {
            this("*/*");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", C4240b4.f.f42573f, n.f66171o, "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", y.f66058y, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "()V", "getClipDataUris", "", "Landroid/net/Uri;", "Landroid/content/Intent;", "getClipDataUris$activity_release", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<Uri> getClipDataUris$activity_release(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final List<Uri> parseResult(int resultCode, @Nullable Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = INSTANCE.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(21)
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @Nullable Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @Nullable Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && input != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", input);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", C4240b4.f.f42573f, n.f66171o, "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final List<Uri> parseResult(int resultCode, @Nullable Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.INSTANCE.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @Nullable Void input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0017B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "", "maxItems", "<init>", "(I)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", C4240b4.f.f42573f, n.f66171o, "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "I", y.f66058y, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int maxItems;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;", "", "()V", "getMaxItems", "", "getMaxItems$activity_release", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                if (PickVisualMedia.INSTANCE.isSystemPickerAvailable$activity_release()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            private Companion() {
            }
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        public /* synthetic */ PickMultipleVisualMedia(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? INSTANCE.getMaxItems$activity_release() : i10);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.INSTANCE;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (this.maxItems > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                return intent;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                Intent intent2 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                intent2.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX, this.maxItems);
                return intent2;
            }
            if (!companion.isGmsPickerAvailable$activity_release(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
            ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
            if (gmsPicker$activity_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
            Intent intent4 = new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES);
            intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent4.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
            return intent4;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final List<Uri> parseResult(int resultCode, @Nullable Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.INSTANCE.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
        }

        public PickMultipleVisualMedia(int i10) {
            this.maxItems = i10;
            if (i10 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000 \u00102\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, y.f66058y, "ImageAndVideo", "ImageOnly", "SingleMimeType", "VideoOnly", "VisualMediaType", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {

        @NotNull
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        @NotNull
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";

        @NotNull
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0007J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0014\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$Companion;", "", "()V", "ACTION_SYSTEM_FALLBACK_PICK_IMAGES", "", "getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations", "GMS_ACTION_PICK_IMAGES", "GMS_EXTRA_PICK_IMAGES_MAX", "getGmsPicker", "Landroid/content/pm/ResolveInfo;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getGmsPicker$activity_release", "getSystemFallbackPicker", "getSystemFallbackPicker$activity_release", "getVisualMimeType", "input", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getVisualMimeType$activity_release", "isGmsPickerAvailable", "", "isGmsPickerAvailable$activity_release", "isPhotoPickerAvailable", "isSystemFallbackPickerAvailable", "isSystemFallbackPickerAvailable$activity_release", "isSystemPickerAvailable", "isSystemPickerAvailable$activity_release", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }

            @Nullable
            public final ResolveInfo getGmsPicker$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES), 1114112);
            }

            @Nullable
            public final ResolveInfo getSystemFallbackPicker$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
            }

            @Nullable
            public final String getVisualMimeType$activity_release(@NotNull VisualMediaType input) {
                Intrinsics.checkNotNullParameter(input, "input");
                if (input instanceof ImageOnly) {
                    return "image/*";
                }
                if (input instanceof VideoOnly) {
                    return "video/*";
                }
                if (input instanceof SingleMimeType) {
                    return ((SingleMimeType) input).getMimeType();
                }
                if (input instanceof ImageAndVideo) {
                    return null;
                }
                throw new m();
            }

            public final boolean isGmsPickerAvailable$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return getGmsPicker$activity_release(context) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            public final boolean isSystemFallbackPickerAvailable$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return getSystemFallbackPicker$activity_release(context) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    return true;
                }
                return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            private Companion() {
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ImageAndVideo implements VisualMediaType {

            @NotNull
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ImageOnly implements VisualMediaType {

            @NotNull
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mimeType", "", "(Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SingleMimeType implements VisualMediaType {

            @NotNull
            private final String mimeType;

            public SingleMimeType(@NotNull String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.mimeType = mimeType;
            }

            @NotNull
            public final String getMimeType() {
                return this.mimeType;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class VideoOnly implements VisualMediaType {

            @NotNull
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface VisualMediaType {
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable() {
            return INSTANCE.isPhotoPickerAvailable();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(@NotNull Context context) {
            return INSTANCE.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Companion companion = INSTANCE;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                Intent intent2 = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent2;
            }
            if (!companion.isGmsPickerAvailable$activity_release(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
            ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
            if (gmsPicker$activity_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
            Intent intent4 = new Intent(GMS_ACTION_PICK_IMAGES);
            intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent4.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            return intent4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) CollectionsKt.firstOrNull((List) GetMultipleContents.INSTANCE.getClipDataUris$activity_release(intent)) : data;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", C4240b4.f.f42573f, n.f66171o, "parseResult", "(ILandroid/content/Intent;)Ljava/util/Map;", y.f66058y, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {

        @NotNull
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";

        @NotNull
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "()V", "ACTION_REQUEST_PERMISSIONS", "", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "createIntent", "Landroid/content/Intent;", "input", "", "createIntent$activity_release", "([Ljava/lang/String;)Landroid/content/Intent;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Intent createIntent$activity_release(@NotNull String[] input) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentPutExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, input);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return INSTANCE.createIntent$activity_release(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (input.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(MapsKt.emptyMap());
            }
            for (String str : input) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(input.length), 16));
            for (String str2 : input) {
                Pair pair = TuplesKt.to(str2, Boolean.TRUE);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Map<String, Boolean> parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                return MapsKt.emptyMap();
            }
            if (intent == null) {
                return MapsKt.emptyMap();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i10 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i10 == 0));
            }
            return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return RequestMultiplePermissions.INSTANCE.createIntent$activity_release(new String[]{input});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (ContextCompat.checkSelfPermission(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Boolean parseResult(int resultCode, @Nullable Intent intent) {
            if (intent == null || resultCode != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            boolean z10 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (intArrayExtra[i10] == 0) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "parseResult", C4240b4.f.f42573f, "", n.f66171o, y.f66058y, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {

        @NotNull
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public ActivityResult parseResult(int resultCode, @Nullable Intent intent) {
            return new ActivityResult(resultCode, intent);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "parseResult", C4240b4.f.f42573f, "", n.f66171o, y.f66058y, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {

        @NotNull
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        @NotNull
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        @NotNull
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull IntentSenderRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public ActivityResult parseResult(int resultCode, @Nullable Intent intent) {
            return new ActivityResult(resultCode, intent);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final Boolean parseResult(int resultCode, @Nullable Intent intent) {
            return Boolean.valueOf(resultCode == -1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context context, @Nullable Void input) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @Nullable Void input) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Bitmap parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", C4240b4.f.f42573f, "", n.f66171o, "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Bitmap parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private ActivityResultContracts() {
    }
}
