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
    private Integer price;

    private String connectionType;

    private String wifiCoverageArea;
    private String connectedDevices;
    private String internetSpeed;

    private String deviceType;
    private String monthlyTraffic;
    private String autonomyImportance;

    private String performancePreference;
    private String additionalFeatures;
    private String outdoorUsage;

    private String budget;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getWifiCoverageArea() {
        return wifiCoverageArea;
    }

    public void setWifiCoverageArea(String wifiCoverageArea) {
        this.wifiCoverageArea = wifiCoverageArea;
    }

    public String getConnectedDevices() {
        return connectedDevices;
    }

    public void setConnectedDevices(String connectedDevices) {
        this.connectedDevices = connectedDevices;
    }

    public String getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(String internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getMonthlyTraffic() {
        return monthlyTraffic;
    }

    public void setMonthlyTraffic(String monthlyTraffic) {
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

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
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
