select * from modem;


INSERT INTO modem (name, 
					connection_type, 
					wifi_coverage_area, connected_devices, internet_speed, 
					device_type, monthly_traffic, autonomy_importance, 
					performance_preference, additional_features, outdoor_usage, 
					price, preferred_brand, urgency, warranty_importance, limitations) 
VALUES 
('TP-Link Archer AX73', 
	'home', 
	150, 50, 5400, 
 	'laptop', 5, 'mediumAutonomy', 
	'priceFirst', 'noAdditionalFeatures', 'indoor', 
 	120, 'tpLink', 'notUrgent', 'mediumWarranty', ''),

('Asus RT-AX82U', 
	'home', 
	200, 60, 5400, 
 	'smartphoneTablet', 20, 'mediumAutonomy', 
	'priceFirst', 'noAdditionalFeatures', 'indoor', 
 	160, 'asus', 'notUrgent', 'highWarranty', ''),

('TP-Link Archer AX6000', 
	'home', 
	250, 80, 6000, 
 	'mobileRouter', 15, 'lowAutonomy', 
	'priceFirst', 'noAdditionalFeatures', 'indoor', 
 	200, 'tpLink', 'notUrgent', 'highWarranty', ''),

('Asus ROG Rapture GT-AX11000', 
	'home', 
	300, 100, 11000, 
 	'laptop', 60, 'lowAutonomy', 
	'priceFirst', 'remoteAccess', 'indoor', 
 	400, 'asus', 'urgent', 'highWarranty', ''),

('TP-Link Deco X60', 
	'home', 
	180, 60, 3000, 
 	'mobileRouter', 40, 'highAutonomy', 
	'performanceFirst', 'noAdditionalFeatures', 'indoor', 
 	250, 'tpLink', 'notUrgent', 'mediumWarranty', ''),

('Asus ZenWiFi AX (XT8)', 
	'home', 
	200, 75, 6600, 
 	'laptop', 35, 'highAutonomy', 
	'priceFirst', 'noAdditionalFeatures', 'indoor', 
 	350, 'asus', 'notUrgent', 'highWarranty', ''),

('TP-Link TL-MR6400', 
	'mobile', 
	100, 32, 150, 
 	'smartphoneTablet', 12, 'mediumAutonomy', 
	'performanceFirst', 'noAdditionalFeatures', 'outdoor', 
 	90, 'tpLink', 'notUrgent', 'mediumWarranty', ''),

('Asus 4G-AC68U', 
	'mobile', 
	120, 50, 600, 
 	'mobileRouter', 32, 'mediumAutonomy', 
	'priceFirst', 'remoteAccess', 'outdoor', 
 	280, 'asus', 'urgent', 'highWarranty', ''),

('TP-Link Archer C80', 
	'home', 
	120, 40, 1900, 
 	'laptop', 64, 'mediumAutonomy', 
	'performanceFirst', 'noAdditionalFeatures', 'indoor', 
 	80, 'tpLink', 'notUrgent', 'mediumWarranty', ''),

('Asus RT-AC59U', 
	'home', 
	150, 50, 1500, 
 	'laptop', 58, 'mediumAutonomy', 
	'performanceFirst', 'noAdditionalFeatures', 'indoor', 
 	70, 'asus', 'notUrgent', 'mediumWarranty', '');

