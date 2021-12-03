package com.digital.saladereuniao.salaDeReuniao.repository;

import com.digital.saladereuniao.salaDeReuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository <Room, Long> {
}
