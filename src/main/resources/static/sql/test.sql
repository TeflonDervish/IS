select * from modem;


insert into modem (name, price, 
					connection_type,
					wifi_coverage_area, connected_devices, internet_speed,
					device_type, monthly_traffic, autonomy_importance,
					performance_preference, additional_features, outdoor_usage, 
					budget, preferred_brand, urgency, warranty_importance, limitations) values
	-- Роутер 1: TP-Link Archer AX50
    ('TP-Link Archer AX50', 40, 
	 'home', 
	 'between50to150', 'moreThan15', 'moreThan300Mbps', 
	 null, null, null, 
	 null, null, null, 
	 'under50', 'tpLink', 'urgent', 'highWarranty', 'noLimitations'), 
	 
	 -- Роутер 2: ASUS RT-AX58U
    ('ASUS RT-AX58U', 200, 
	 'home', 
	 'moreThan150', 'moreThan15', 'moreThan300Mbps', 
	 null, null, null, 
	 null, null, null, 
	 'under50', 'asus', 'notUrgent', 'mediumWarranty', 'noLimitations');

	
