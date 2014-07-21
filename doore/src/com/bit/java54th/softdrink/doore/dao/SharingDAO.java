<<<<<<< HEAD
package com.bit.java54th.softdrink.doore.dao;

import java.util.List;

public interface SharingDAO {
	public List<SharingVO> findAllSharings();

	public SharingVO findSharingByID(int sharingID);

	public List<SharingVO> findSharingByApplicationID(int applicationID);
	public List<SharingVO> findSharingByProductID(int productID);

	public int createSharing(int returnCheck, int applicationID,
			String startDay, String endDay, int productID);

	public int updateSharing(int sharingID, String startDay, String endDay);

	public int deleteSharing(int sharingID);

	public int getLendingPeriod(int sharingID);

	public int changeSharingState(int sharingID, int returnCheck);

	public int returnProduct(int sharingID);
}
=======
package com.bit.java54th.softdrink.doore.dao;

import java.util.List;

public interface SharingDAO {
	public List<SharingVO> findAllSharings();

	public SharingVO findSharingByID(int sharingID);

	public List<SharingVO> findSharingByApplicationID(int applicationID);
	public List<SharingVO> findSharingByProductID(int productID);

	public int createSharing(int returnCheck, int applicationID,
			String startDay, String endDay, int productID);

	public int updateSharing(int sharingID, String startDay, String endDay);

	public int deleteSharing(int sharingID);

	public int getLendingPeriod(int sharingID);

	public int changeSharingState(int sharingID, int returnCheck);

	public int returnProduct(int sharingID);
}
>>>>>>> addc53ff49b46622ea64152ad8e424fdb64bc862
