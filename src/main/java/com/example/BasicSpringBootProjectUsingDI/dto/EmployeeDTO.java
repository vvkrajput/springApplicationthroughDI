package com.example.BasicSpringBootProjectUsingDI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
   private int id;
    private String name;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;

// public EmployeeDTO(int id, String name, LocalDate dateOfJoining, boolean b) {
//  this.id = id;
//  this.name = name;
//  this.dateOfJoining = dateOfJoining;
//  this.isActive = b;
// }
//
//
// public int getId() {
//  return id;
// }
//
// public void setId(int id) {
//  this.id = id;
// }
//
// public String getName() {
//  return name;
// }
//
// public void setName(String name) {
//  this.name = name;
// }
//
// public LocalDate getDateOfJoining() {
//  return dateOfJoining;
// }
//
// public void setDateOfJoining(LocalDate dateOfJoining) {
//  this.dateOfJoining = dateOfJoining;
// }
//
// public boolean isActive() {
//  return isActive;
// }
//
// public void setActive(boolean active) {
//  isActive = active;
// }
}
