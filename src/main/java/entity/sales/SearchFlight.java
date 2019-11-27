package entity.sales;

public class SearchFlight {
         private String flightNumber;
         private String departureTime;
         private String arrivalTime;
         private String startAirplane;
         private String endAirplane;
         private String fromCity;
         private String toCity;
         private String firstClassRemainSeats;
         private String firstPrice;
         private String businessClassRemainSeats;
         private String businessPrice;
         private String economyClassRemainSeats;
         private String economyPrice;
		public SearchFlight() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SearchFlight(String flightNumber, String departureTime, String arrivalTime, String startAirplane,
				String endAirplane, String fromCity, String toCity, String firstClassRemainSeats, String firstPrice,
				String businessClassRemainSeats, String businessPrice, String economyClassRemainSeats,
				String economyPrice) {
			super();
			this.flightNumber = flightNumber;
			this.departureTime = departureTime;
			this.arrivalTime = arrivalTime;
			this.startAirplane = startAirplane;
			this.endAirplane = endAirplane;
			this.fromCity = fromCity;
			this.toCity = toCity;
			this.firstClassRemainSeats = firstClassRemainSeats;
			this.firstPrice = firstPrice;
			this.businessClassRemainSeats = businessClassRemainSeats;
			this.businessPrice = businessPrice;
			this.economyClassRemainSeats = economyClassRemainSeats;
			this.economyPrice = economyPrice;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public String getStartAirplane() {
			return startAirplane;
		}
		public void setStartAirplane(String startAirplane) {
			this.startAirplane = startAirplane;
		}
		public String getEndAirplane() {
			return endAirplane;
		}
		public void setEndAirplane(String endAirplane) {
			this.endAirplane = endAirplane;
		}
		public String getFromCity() {
			return fromCity;
		}
		public void setFromCity(String fromCity) {
			this.fromCity = fromCity;
		}
		public String getToCity() {
			return toCity;
		}
		public void setToCity(String toCity) {
			this.toCity = toCity;
		}
		public String getFirstClassRemainSeats() {
			return firstClassRemainSeats;
		}
		public void setFirstClassRemainSeats(String firstClassRemainSeats) {
			this.firstClassRemainSeats = firstClassRemainSeats;
		}
		public String getFirstPrice() {
			return firstPrice;
		}
		public void setFirstPrice(String firstPrice) {
			this.firstPrice = firstPrice;
		}
		public String getBusinessClassRemainSeats() {
			return businessClassRemainSeats;
		}
		public void setBusinessClassRemainSeats(String businessClassRemainSeats) {
			this.businessClassRemainSeats = businessClassRemainSeats;
		}
		public String getBusinessPrice() {
			return businessPrice;
		}
		public void setBusinessPrice(String businessPrice) {
			this.businessPrice = businessPrice;
		}
		public String getEconomyClassRemainSeats() {
			return economyClassRemainSeats;
		}
		public void setEconomyClassRemainSeats(String economyClassRemainSeats) {
			this.economyClassRemainSeats = economyClassRemainSeats;
		}
		public String getEconomyPrice() {
			return economyPrice;
		}
		public void setEconomyPrice(String economyPrice) {
			this.economyPrice = economyPrice;
		}
		@Override
		public String toString() {
			return "SearchFlight [flightNumber=" + flightNumber + ", departureTime=" + departureTime + ", arrivalTime="
					+ arrivalTime + ", startAirplane=" + startAirplane + ", endAirplane=" + endAirplane + ", fromCity="
					+ fromCity + ", toCity=" + toCity + ", firstClassRemainSeats=" + firstClassRemainSeats
					+ ", firstPrice=" + firstPrice + ", businessClassRemainSeats=" + businessClassRemainSeats
					+ ", businessPrice=" + businessPrice + ", economyClassRemainSeats=" + economyClassRemainSeats
					+ ", economyPrice=" + economyPrice + "]";
		}
         
        
}
