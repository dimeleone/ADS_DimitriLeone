package state.statuspedido;

/*
 * @autor dimitri.leone
 * @since 13.06.2023
 */

public enum StatusPedido {

	INICIAL {
		@Override
		public StatusPedido avancar() {
			return PAGO;
		}

		@Override
		public StatusPedido cancelar() {
			return CANCELADO;
		}
	}
	,
	PAGO {
		@Override
		public StatusPedido avancar() {
			return ENTREGUE;
		}

		@Override
		public StatusPedido cancelar() {
			return CANCELADO;
		}
	}
	,
	ENTREGUE {
		@Override
		public StatusPedido avancar() {
			return FINALIZADO;
		}

		@Override
		public StatusPedido cancelar() {
			return CANCELADO;
		}
	}
	,
	FINALIZADO {
		@Override
		public StatusPedido avancar() {
			return FINALIZADO;
		}

		@Override
		public StatusPedido cancelar() {
			return FINALIZADO;
		}
	}
	,
	CANCELADO {
		@Override
		public StatusPedido avancar() {
			return CANCELADO;
		}

		@Override
		public StatusPedido cancelar() {
			return CANCELADO;
		}
	}
	;
	
	
	//Operações
	abstract public StatusPedido avancar();
	abstract public StatusPedido cancelar();
	
}
