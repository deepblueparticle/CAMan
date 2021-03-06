package hadoopmodel.diagram.edit.parts;

import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class HadoopStackEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (HadoopStackVisualIDRegistry.getVisualID(view)) {

			case CloudEditPart.VISUAL_ID:
				return new CloudEditPart(view);

			case ServerEditPart.VISUAL_ID:
				return new ServerEditPart(view);

			case ServerServer_nameEditPart.VISUAL_ID:
				return new ServerServer_nameEditPart(view);

			case HDFSNameNodeEditPart.VISUAL_ID:
				return new HDFSNameNodeEditPart(view);

			case HDFSNameNodeHdfsnamenode_data_dirEditPart.VISUAL_ID:
				return new HDFSNameNodeHdfsnamenode_data_dirEditPart(view);

			case HDFSDataNodeEditPart.VISUAL_ID:
				return new HDFSDataNodeEditPart(view);

			case HDFSDataNodeHdfsdatanode_data_dirEditPart.VISUAL_ID:
				return new HDFSDataNodeHdfsdatanode_data_dirEditPart(view);

			case TaskTrackerEditPart.VISUAL_ID:
				return new TaskTrackerEditPart(view);

			case TaskTrackerTasktracker_data_dirEditPart.VISUAL_ID:
				return new TaskTrackerTasktracker_data_dirEditPart(view);

			case JobTrackerEditPart.VISUAL_ID:
				return new JobTrackerEditPart(view);

			case JobTrackerJobtracker_data_dirEditPart.VISUAL_ID:
				return new JobTrackerJobtracker_data_dirEditPart(view);

			case JavaEditPart.VISUAL_ID:
				return new JavaEditPart(view);

			case JavaJava_jdk_versionEditPart.VISUAL_ID:
				return new JavaJava_jdk_versionEditPart(view);

			case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
				return new HDFSDataNodeHdfsdatanode_hostOnEditPart(view);

			case JobTrackerJobtracker_hostOnEditPart.VISUAL_ID:
				return new JobTrackerJobtracker_hostOnEditPart(view);

			case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
				return new HDFSNameNodeHdfsnamenode_hostOnEditPart(view);

			case TaskTrackerTasktracker_connectToEditPart.VISUAL_ID:
				return new TaskTrackerTasktracker_connectToEditPart(view);

			case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID:
				return new HDFSDataNodeHdfsdatanode_connectToEditPart(view);

			case TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID:
				return new TaskTrackerTasktracker_hostOnEditPart(view);

			case JobTrackerJobtracker_dependOnEditPart.VISUAL_ID:
				return new JobTrackerJobtracker_dependOnEditPart(view);

			case JavaJava_hostOnEditPart.VISUAL_ID:
				return new JavaJava_hostOnEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
