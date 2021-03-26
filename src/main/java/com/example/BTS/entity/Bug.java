package com.example.BTS.entity;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.NotNull;
    import org.springframework.data.annotation.Id;

	public class Bug {
		@NotNull
		@NotBlank
		private String status;
	    public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@NotNull
		private String description;
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		@Id
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
	}
		
		
		