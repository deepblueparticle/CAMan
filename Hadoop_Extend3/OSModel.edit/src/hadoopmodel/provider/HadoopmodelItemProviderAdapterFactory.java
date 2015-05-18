/**
 */
package hadoopmodel.provider;

import hadoopmodel.util.HadoopmodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopmodelItemProviderAdapterFactory extends HadoopmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.Cloud} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudItemProvider cloudItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.Cloud}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCloudAdapter() {
		if (cloudItemProvider == null) {
			cloudItemProvider = new CloudItemProvider(this);
		}

		return cloudItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.Server} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerItemProvider serverItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerAdapter() {
		if (serverItemProvider == null) {
			serverItemProvider = new ServerItemProvider(this);
		}

		return serverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.Java} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaItemProvider javaItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.Java}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaAdapter() {
		if (javaItemProvider == null) {
			javaItemProvider = new JavaItemProvider(this);
		}

		return javaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.JobTracker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobTrackerItemProvider jobTrackerItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.JobTracker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobTrackerAdapter() {
		if (jobTrackerItemProvider == null) {
			jobTrackerItemProvider = new JobTrackerItemProvider(this);
		}

		return jobTrackerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.TaskTracker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTrackerItemProvider taskTrackerItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.TaskTracker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskTrackerAdapter() {
		if (taskTrackerItemProvider == null) {
			taskTrackerItemProvider = new TaskTrackerItemProvider(this);
		}

		return taskTrackerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.HDFSNameNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSNameNodeItemProvider hdfsNameNodeItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.HDFSNameNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHDFSNameNodeAdapter() {
		if (hdfsNameNodeItemProvider == null) {
			hdfsNameNodeItemProvider = new HDFSNameNodeItemProvider(this);
		}

		return hdfsNameNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.HDFSDataNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSDataNodeItemProvider hdfsDataNodeItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.HDFSDataNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHDFSDataNodeAdapter() {
		if (hdfsDataNodeItemProvider == null) {
			hdfsDataNodeItemProvider = new HDFSDataNodeItemProvider(this);
		}

		return hdfsDataNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.HBaseMaster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBaseMasterItemProvider hBaseMasterItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.HBaseMaster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHBaseMasterAdapter() {
		if (hBaseMasterItemProvider == null) {
			hBaseMasterItemProvider = new HBaseMasterItemProvider(this);
		}

		return hBaseMasterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hadoopmodel.HBaseRegionServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBaseRegionServerItemProvider hBaseRegionServerItemProvider;

	/**
	 * This creates an adapter for a {@link hadoopmodel.HBaseRegionServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHBaseRegionServerAdapter() {
		if (hBaseRegionServerItemProvider == null) {
			hBaseRegionServerItemProvider = new HBaseRegionServerItemProvider(this);
		}

		return hBaseRegionServerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cloudItemProvider != null) cloudItemProvider.dispose();
		if (serverItemProvider != null) serverItemProvider.dispose();
		if (javaItemProvider != null) javaItemProvider.dispose();
		if (jobTrackerItemProvider != null) jobTrackerItemProvider.dispose();
		if (taskTrackerItemProvider != null) taskTrackerItemProvider.dispose();
		if (hdfsNameNodeItemProvider != null) hdfsNameNodeItemProvider.dispose();
		if (hdfsDataNodeItemProvider != null) hdfsDataNodeItemProvider.dispose();
		if (hBaseMasterItemProvider != null) hBaseMasterItemProvider.dispose();
		if (hBaseRegionServerItemProvider != null) hBaseRegionServerItemProvider.dispose();
	}

}
