package ru.semenov.IS.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data
public class Modem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String connectionType;

    private Integer wifiCoverageArea;
    private Integer connectedDevices;
    private Integer internetSpeed;

    private String deviceType;
    private Integer monthlyTraffic;
    private String autonomyImportance;

    private String performancePreference;
    private String additionalFeatures;
    private String outdoorUsage;

    private Integer price;
    private String preferredBrand;
    private String urgency;
    private String warrantyImportance;
    private String limitations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public Integer getWifiCoverageArea() {
        return wifiCoverageArea;
    }

    public void setWifiCoverageArea(Integer wifiCoverageArea) {
        this.wifiCoverageArea = wifiCoverageArea;
    }

    public Integer getConnectedDevices() {
        return connectedDevices;
    }

    public void setConnectedDevices(Integer connectedDevices) {
        this.connectedDevices = connectedDevices;
    }

    public Integer getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(Integer internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getMonthlyTraffic() {
        return monthlyTraffic;
    }

    public void setMonthlyTraffic(Integer monthlyTraffic) {
        this.monthlyTraffic = monthlyTraffic;
    }

    public String getAutonomyImportance() {
        return autonomyImportance;
    }

    public void setAutonomyImportance(String autonomyImportance) {
        this.autonomyImportance = autonomyImportance;
    }

    public String getPerformancePreference() {
        return performancePreference;
    }

    public void setPerformancePreference(String performancePreference) {
        this.performancePreference = performancePreference;
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(String additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    public String getOutdoorUsage() {
        return outdoorUsage;
    }

    public void setOutdoorUsage(String outdoorUsage) {
        this.outdoorUsage = outdoorUsage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPreferredBrand() {
        return preferredBrand;
    }

    public void setPreferredBrand(String preferredBrand) {
        this.preferredBrand = preferredBrand;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getWarrantyImportance() {
        return warrantyImportance;
    }

    public void setWarrantyImportance(String warrantyImportance) {
        this.warrantyImportance = warrantyImportance;
    }

    public String getLimitations() {
        return limitations;
    }

    public void setLimitations(String limitations) {
        this.limitations = limitations;
    }
}
