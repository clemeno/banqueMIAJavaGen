package fr.alma.projet.generation.banque.ui.controler.h1208499787;

import com.mia.formation.mvc.*;
import com.mia.metamodel.*;
import com.mia.openapi.*;
import com.mia.openapi.refactoring.model.*;
import com.mia.openapi.reflect.*;
import com.mia.resource.*;
import java.io.*;
import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;

@SuppressWarnings({"unused","unchecked","rawtypes","nls","serial",})
public class mvc_View__ControlerImpl_2121560768 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_View__ControlerImpl_2121560768() {
		//Do nothing
	}

	//For internal use only
	mvc_View__ControlerImpl_2121560768(int anyInt, List anyList) {
		List<java.lang.Integer> otherList = anyList;
		throw new java.lang.UnsupportedOperationException();
	}

	private static <T> T __check_arg__(java.lang.Class<T> expectedClass, Object argument) {
		T result = null;
		if (java.lang.Integer.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Integer(((Double) argument).intValue());
		} else if (java.lang.Float.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Float(((Double) argument).floatValue());
		} else {
			try {			
				result = expectedClass.cast(argument);
			} catch(Throwable ex) {
				throw new IllegalArgumentException(
						String.format(
								"Bad parameter type in call to %s. Found '%s' when expected '%s'.",
								"ControlerImpl", argument.getClass().getName(),
								expectedClass.getName()));
			}
		}
		return result;
	}


	public java.lang.Object evaluate(java.lang.Object[] _action_parameters) {
		return runAction(_action_parameters);
	}

	public String runAction(java.lang.Object[] _action_parameters) {
		if (_action_parameters.length != 3)
			throw new IllegalArgumentException("Wrong number of parameters in call to ''ControlerImpl''");

		final com.mia.formation.mvc.View current = __check_arg__(com.mia.formation.mvc.View.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.View current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append("package fr.alma.projet.generation.banque.ui.controler.swt;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.SWT;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.events.SelectionAdapter;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.events.SelectionEvent;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.layout.GridData;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.layout.GridLayout;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Button;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Display;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Label;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Shell;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Text;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.List;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Group;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import fr.alma.projet.generation.banque.ui.controler.I");
_template_buffer.append(manager.action(current, "ComputeModelName"));_template_buffer.append("Controler;");
_template_buffer.append('\n');
_template_buffer.append("import fr.alma.projet.generation.banque.ui.view.I");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(";");
_template_buffer.append('\n');
_template_buffer.append("import fr.alma.projet.generation.banque.ui.view.swt.");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(";");
_template_buffer.append('\n');
_template_buffer.append("import fr.alma.projet.generation.banque.model.I");
_template_buffer.append(manager.action(current, "ComputeModelName"));_template_buffer.append(";");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("public class ");
_template_buffer.append(manager.action(current, "ComputeModelName"));_template_buffer.append("Controler implements I");
_template_buffer.append(manager.action(current, "ComputeModelName"));_template_buffer.append("Controler {");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append(manager.action(current, "AttributeDeclaration"));_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("	public ");
_template_buffer.append(manager.action(current, "ComputeModelName"));_template_buffer.append("Controler(I");
_template_buffer.append(manager.action(current, "ComputeModelName"));_template_buffer.append(" model) {");
_template_buffer.append('\n');
_template_buffer.append("		this.model = model;");
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("	public void initView() {");
_template_buffer.append('\n');
_template_buffer.append("		Display display = Display.getDefault();");
_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		this.view = new ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("(display, this.model, this);");
_template_buffer.append('\n');
_template_buffer.append("		this.view.open();");
_template_buffer.append('\n');
_template_buffer.append("		this.view.layout();");
_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		while (!this.view.isDisposed()) {");
_template_buffer.append('\n');
_template_buffer.append("			if (!display.readAndDispatch()) {");
_template_buffer.append('\n');
_template_buffer.append("				display.sleep();");
_template_buffer.append('\n');
_template_buffer.append("			}");
_template_buffer.append('\n');
_template_buffer.append("		}");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append(manager.action(current, "ComputeAvailableActionsImpl"));_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("}");
return _template_buffer.toString();

}
}
