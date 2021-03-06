package osmodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import osmodel.diagram.edit.commands.SoftwareSoftware_hostOnCreateCommand;
import osmodel.diagram.edit.commands.SoftwareSoftware_hostOnReorientCommand;
import osmodel.diagram.edit.commands.WebWrapWeb_connectToCreateCommand;
import osmodel.diagram.edit.commands.WebWrapWeb_connectToReorientCommand;
import osmodel.diagram.edit.parts.SoftwareSoftware_hostOnEditPart;
import osmodel.diagram.edit.parts.WebWrapWeb_connectToEditPart;
import osmodel.diagram.part.OSModelVisualIDRegistry;
import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class MySQLWrapItemSemanticEditPolicy extends
		OSModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MySQLWrapItemSemanticEditPolicy() {
		super(OSModelElementTypes.MySQLWrap_2005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (OSModelVisualIDRegistry.getVisualID(incomingLink) == WebWrapWeb_connectToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (OSModelVisualIDRegistry.getVisualID(outgoingLink) == SoftwareSoftware_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OSModelElementTypes.WebWrapWeb_connectTo_4004 == req
				.getElementType()) {
			return null;
		}
		if (OSModelElementTypes.SoftwareSoftware_hostOn_4006 == req
				.getElementType()) {
			return getGEFWrapper(new SoftwareSoftware_hostOnCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OSModelElementTypes.WebWrapWeb_connectTo_4004 == req
				.getElementType()) {
			return getGEFWrapper(new WebWrapWeb_connectToCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (OSModelElementTypes.SoftwareSoftware_hostOn_4006 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case WebWrapWeb_connectToEditPart.VISUAL_ID:
			return getGEFWrapper(new WebWrapWeb_connectToReorientCommand(req));
		case SoftwareSoftware_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new SoftwareSoftware_hostOnReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
