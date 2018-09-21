package yj.spring.template.aop;

import java.io.Serializable;

public class MQModel implements Serializable {
    private Integer missionType;
    private Long missionId;
    private String refId;
    private String data;
    private Integer maxRunCount;

    public Integer getMissionType() {
        return missionType;
    }

    public void setMissionType(Integer missionType) {
        this.missionType = missionType;
    }

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getMaxRunCount() {
        return maxRunCount;
    }

    public void setMaxRunCount(Integer maxRunCount) {
        this.maxRunCount = maxRunCount;
    }

    @Override
    public String toString() {
        return "MQModel [missionType=" + missionType + ", missionId=" + missionId + ", refId=" + refId + ", data="
                + data + ", maxRunCount=" + maxRunCount + "]";
    }

}
