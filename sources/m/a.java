package m;

import android.content.ComponentName;
import android.content.Intent;
import androidx.test.internal.platform.app.ActivityInvoker;
import androidx.test.platform.app.InstrumentationRegistry;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static Intent a(ActivityInvoker activityInvoker, Class cls) {
        Intent intentMakeMainActivity = Intent.makeMainActivity(new ComponentName(InstrumentationRegistry.getInstrumentation().getTargetContext(), (Class<?>) cls));
        return InstrumentationRegistry.getInstrumentation().getTargetContext().getPackageManager().resolveActivity(intentMakeMainActivity, 0) != null ? intentMakeMainActivity : Intent.makeMainActivity(new ComponentName(InstrumentationRegistry.getInstrumentation().getContext(), (Class<?>) cls));
    }
}
