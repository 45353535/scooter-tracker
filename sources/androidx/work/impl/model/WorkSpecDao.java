package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import com.taurusx.tax.y.z.w.s;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0014\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u0010H'J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H'J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH'J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001cH'J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0012H'J\u0012\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\bH'J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0007\u001a\u00020\bH'J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0*2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\u000b2\u0006\u0010,\u001a\u00020\bH'J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0*2\u0006\u0010,\u001a\u00020\bH'J\u001c\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\u00102\u0006\u0010,\u001a\u00020\bH'J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020%0\u000b2\u0006\u0010\r\u001a\u00020\bH'J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\u00102\u0006\u0010\r\u001a\u00020\bH'J\u001c\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0*2\u0006\u0010\r\u001a\u00020\bH'J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010,\u001a\u00020\bH'J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\r\u001a\u00020\bH'J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002070*H'J\u0018\u00108\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00109\u001a\u00020\u001cH'J\u0018\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00102\u0006\u0010\u0007\u001a\u00020\bH'J\b\u0010;\u001a\u00020\u0012H'J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010=\u001a\u00020\u0012H'J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH'J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010@\u001a\u00020\u0012H'J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH'J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH'J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010D\u001a\u00020\u001cH'J\b\u0010E\u001a\u00020\u0003H'J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010G\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010H\u001a\u00020\u0012H'J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u0012H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006KÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "insertWorkSpec", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "delete", "id", "", "getWorkSpec", "getWorkSpecIdAndStatesForName", "", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "name", "getAllWorkSpecIds", "getAllWorkSpecIdsLiveData", "Landroidx/lifecycle/LiveData;", "setState", "", "state", "Landroidx/work/WorkInfo$State;", "setCancelledState", "incrementPeriodCount", "setOutput", "output", "Landroidx/work/Data;", "setLastEnqueueTime", "enqueueTime", "", "incrementWorkSpecRunAttemptCount", "resetWorkSpecRunAttemptCount", "setNextScheduleTimeOverride", "nextScheduleTimeOverrideMillis", "resetWorkSpecNextScheduleTimeOverride", "overrideGeneration", "getState", "getWorkStatusPojoForId", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForIds", "ids", "getWorkStatusPojoLiveDataForIds", "getWorkStatusPojoFlowDataForIds", "Lkotlinx/coroutines/flow/Flow;", "getWorkStatusPojoForTag", s.z.f67720z, "getWorkStatusPojoFlowForTag", "getWorkStatusPojoLiveDataForTag", "getWorkStatusPojoForName", "getWorkStatusPojoLiveDataForName", "getWorkStatusPojoFlowForName", "getInputsFromPrerequisites", "getUnfinishedWorkWithTag", "getUnfinishedWorkWithName", "getAllUnfinishedWork", "hasUnfinishedWorkFlow", "", "markWorkSpecScheduled", "startTime", "getScheduleRequestedAtLiveData", "resetScheduledState", "getEligibleWorkForScheduling", "schedulerLimit", "getEligibleWorkForSchedulingWithContentUris", "getAllEligibleWorkSpecsForScheduling", "maxLimit", "getScheduledWork", "getRunningWork", "getRecentlyCompletedWork", "startingAt", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "incrementGeneration", "updateWorkSpec", "countNonFinishedContentUriTriggerWorkers", "setStopReason", "stopReason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UnknownNullness"})
public interface WorkSpecDao {
    @Query("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)")
    int countNonFinishedContentUriTriggerWorkers();

    @Query("DELETE FROM workspec WHERE id=:id")
    void delete(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    @NotNull
    List<String> getAllUnfinishedWork();

    @Query("SELECT id FROM workspec")
    @NotNull
    List<String> getAllWorkSpecIds();

    @Query("SELECT id FROM workspec")
    @Transaction
    @NotNull
    LiveData<List<String>> getAllWorkSpecIdsLiveData();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))")
    @NotNull
    List<WorkSpec> getEligibleWorkForScheduling(int schedulerLimit);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time")
    @NotNull
    List<WorkSpec> getEligibleWorkForSchedulingWithContentUris();

    @Query("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    List<Data> getInputsFromPrerequisites(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    List<WorkSpec> getRecentlyCompletedWork(long startingAt);

    @Query("SELECT * FROM workspec WHERE state=1")
    @NotNull
    List<WorkSpec> getRunningWork();

    @Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    @NotNull
    LiveData<Long> getScheduleRequestedAtLiveData(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    List<WorkSpec> getScheduledWork();

    @Query("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    WorkInfo.State getState(@NotNull String id2);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<String> getUnfinishedWorkWithName(@NotNull String name);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @NotNull
    List<String> getUnfinishedWorkWithTag(@NotNull String tag);

    @Query("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    WorkSpec getWorkSpec(@NotNull String id2);

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    Flow getWorkStatusPojoFlowDataForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    Flow getWorkStatusPojoFlowForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    Flow getWorkStatusPojoFlowForTag(@NotNull String tag);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=:id")
    @Transaction
    @Nullable
    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(@NotNull String id2);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(@NotNull String tag);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(@NotNull String tag);

    @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    @NotNull
    Flow hasUnfinishedWorkFlow();

    @Query("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void incrementGeneration(@NotNull String id2);

    @Query("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void incrementPeriodCount(@NotNull String id2);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(@NotNull String id2);

    @Insert(onConflict = 5)
    void insertWorkSpec(@NotNull WorkSpec workSpec);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@NotNull String id2, long startTime);

    @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @Query("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=:id AND next_schedule_time_override_generation=:overrideGeneration)")
    void resetWorkSpecNextScheduleTimeOverride(@NotNull String id2, int overrideGeneration);

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(@NotNull String id2);

    @Query("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=:id")
    int setCancelledState(@NotNull String id2);

    @Query("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void setLastEnqueueTime(@NotNull String id2, long enqueueTime);

    @Query("UPDATE workspec SET next_schedule_time_override=:nextScheduleTimeOverrideMillis WHERE id=:id")
    void setNextScheduleTimeOverride(@NotNull String id2, long nextScheduleTimeOverrideMillis);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(@NotNull String id2, @NotNull Data output);

    @Query("UPDATE workspec SET state=:state WHERE id=:id")
    int setState(@NotNull WorkInfo.State state, @NotNull String id2);

    @Query("UPDATE workspec SET stop_reason=:stopReason WHERE id=:id")
    void setStopReason(@NotNull String id2, int stopReason);

    @Update
    void updateWorkSpec(@NotNull WorkSpec workSpec);
}
