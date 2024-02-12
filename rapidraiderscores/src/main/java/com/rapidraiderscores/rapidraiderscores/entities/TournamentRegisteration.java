package com.rapidraiderscores.rapidraiderscores.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TournamentRegisteration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tournamentId;
	private String tournamentName;
    private String organizerName;
    private String tournamentDescription;
	private LocalDate startDate;
    private LocalDate endDate;
    private String locationVenue;
    private String tournamentFormat;
    private long entryFees;
    
//    public TournamentRegisteration() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public TournamentRegisteration(String tournamentName, String organizerName, String tournamentDescription,
//			String startDate, String endDate, String locationVenue, String tournamentFormat, String entryFees) {
//		super();
//		this.tournamentName = tournamentName;
//		this.organizerName = organizerName;
//		this.tournamentDescription = tournamentDescription;
//		this.startDate = startDate;
//		this.endDate = endDate;
//		this.locationVenue = locationVenue;
//		this.tournamentFormat = tournamentFormat;
//		this.entryFees = entryFees;
//	}
//	
//	public void setTournamentName(String tournamentName) {
//		this.tournamentName = tournamentName;
//	}
//	public void setOrganizerName(String organizerName) {
//		this.organizerName = organizerName;
//	}
//	public void setTournamentDescription(String tournamentDescription) {
//		this.tournamentDescription = tournamentDescription;
//	}
//	public void setStartDate(String startDate) {
//		this.startDate = startDate;
//	}
//	public void setEndDate(String endDate) {
//		this.endDate = endDate;
//	}
//	public void setLocationVenue(String locationVenue) {
//		this.locationVenue = locationVenue;
//	}
//	public void setTournamentFormat(String tournamentFormat) {
//		this.tournamentFormat = tournamentFormat;
//	}
//	public void setEntryFees(String entryFees) {
//		this.entryFees = entryFees;
//	}
//	
//	public long getTournamentId() {
//		return tournamentId;
//	}
//	public String getTournamentName() {
//		return tournamentName;
//	}
//	public String getOrganizerName() {
//		return organizerName;
//	}
//	public String getTournamentDescription() {
//		return tournamentDescription;
//	}
//	public String getStartDate() {
//		return startDate;
//	}
//	public String getEndDate() {
//		return endDate;
//	}
//	public String getLocationVenue() {
//		return locationVenue;
//	}
//	public String getTournamentFormat() {
//		return tournamentFormat;
//	}
//	public String getEntryFees() {
//		return entryFees;
//	}
    
    public TournamentRegisteration(long tournamentId, String tournamentName, String organizerName,
			String tournamentDescription, LocalDate startDate, LocalDate endDate, String locationVenue,
			String tournamentFormat, long entryFees) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentName = tournamentName;
		this.organizerName = organizerName;
		this.tournamentDescription = tournamentDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.locationVenue = locationVenue;
		this.tournamentFormat = tournamentFormat;
		this.entryFees = entryFees;
	}

	public TournamentRegisteration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getTournamentId() {
		return tournamentId;
	}

//	public void setTournamentId(int tournamentId) {
//		this.tournamentId = tournamentId;
//	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}

	public String getTournamentDescription() {
		return tournamentDescription;
	}

	public void setTournamentDescription(String tournamentDescription) {
		this.tournamentDescription = tournamentDescription;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getLocationVenue() {
		return locationVenue;
	}

	public void setLocationVenue(String locationVenue) {
		this.locationVenue = locationVenue;
	}

	public String getTournamentFormat() {
		return tournamentFormat;
	}

	public void setTournamentFormat(String tournamentFormat) {
		this.tournamentFormat = tournamentFormat;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(long entryFees) {
		this.entryFees = entryFees;
	}
}
