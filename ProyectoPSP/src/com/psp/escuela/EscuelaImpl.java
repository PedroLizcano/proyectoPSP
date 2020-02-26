package com.psp.escuela;

import java.util.ArrayList;
import java.util.List;

public class EscuelaImpl implements Escuela{
	List<AlumnoRequest> alumno= new ArrayList<AlumnoRequest>();
	List<AsignaturaRequest> asignaturas= new ArrayList<AsignaturaRequest>();
	List<EvaluacionRequest > evaluaciones= new ArrayList<EvaluacionRequest >();
	
	@Override
	public EvaluacionResponse escuelaevaluacion(EvaluacionRequest parameters) {
		// TODO Auto-generated method stub
		
		return null ;
	}

	@Override
	public AlumnoResponse escuelaalumno(AlumnoRequest parameters) {
		// TODO Auto-generated method stub
		AlumnoRequest request =new AlumnoRequest();
		request.setDireccionalumno(parameters.getDireccionalumno());
		request.setIdalumno(parameters.getIdalumno());
		request.setNamealumno(parameters.getNamealumno());
		alumno.add(request);
		return null;
		
		
	}

	@Override
	public AsignaturaResponse escuelaasignatura(AsignaturaRequest parameters) {
		// TODO Auto-generated method stub
		AsignaturaRequest request = new AsignaturaRequest();
		request.setIdasignatura(parameters.getIdasignatura());
		request.setNameasignatura(parameters.getNameasignatura());
		asignaturas.add(request);
		return null;
	}

}
