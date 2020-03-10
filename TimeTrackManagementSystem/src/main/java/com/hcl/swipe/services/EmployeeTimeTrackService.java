package com.hcl.swipe.services;

import com.hcl.swipe.model.EmployeeTimeTrack;

public interface EmployeeTimeTrackService {
	int saveTimeTrack(EmployeeTimeTrack employeeTimeTrack);

	int updateTimeTrack(EmployeeTimeTrack employeeTimeTrack);
}
